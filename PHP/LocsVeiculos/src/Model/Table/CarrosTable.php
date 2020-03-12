<?php
namespace App\Model\Table;

use Cake\ORM\Query;
use Cake\ORM\RulesChecker;
use Cake\ORM\Table;
use Cake\Validation\Validator;

/**
 * Carros Model
 *
 * @property \App\Model\Table\ModelosTable|\Cake\ORM\Association\BelongsTo $Modelos
 * @property \App\Model\Table\InventariosTable|\Cake\ORM\Association\HasMany $Inventarios
 * @property \App\Model\Table\ModelosTable|\Cake\ORM\Association\HasMany $Modelos
 *
 * @method \App\Model\Entity\Carro get($primaryKey, $options = [])
 * @method \App\Model\Entity\Carro newEntity($data = null, array $options = [])
 * @method \App\Model\Entity\Carro[] newEntities(array $data, array $options = [])
 * @method \App\Model\Entity\Carro|bool save(\Cake\Datasource\EntityInterface $entity, $options = [])
 * @method \App\Model\Entity\Carro saveOrFail(\Cake\Datasource\EntityInterface $entity, $options = [])
 * @method \App\Model\Entity\Carro patchEntity(\Cake\Datasource\EntityInterface $entity, array $data, array $options = [])
 * @method \App\Model\Entity\Carro[] patchEntities($entities, array $data, array $options = [])
 * @method \App\Model\Entity\Carro findOrCreate($search, callable $callback = null, $options = [])
 *
 * @mixin \Cake\ORM\Behavior\TimestampBehavior
 */
class CarrosTable extends Table
{
    /**
     * Initialize method
     *
     * @param array $config The configuration for the Table.
     * @return void
     */
    public function initialize(array $config)
    {
        parent::initialize($config);

        $this->setTable('carros');
        $this->setDisplayField('nome');
        $this->setPrimaryKey('id');

        $this->addBehavior('Timestamp');

        $this->belongsTo('Modelos', [
            'foreignKey' => 'modelo_id',
            'joinType' => 'INNER'
        ]);
        $this->hasMany('Inventarios', [
            'foreignKey' => 'carro_id'
        ]);
        $this->hasMany('Modelos', [
            'foreignKey' => 'carro_id'
        ]);
    }

    /**
     * Default validation rules.
     *
     * @param \Cake\Validation\Validator $validator Validator instance.
     * @return \Cake\Validation\Validator
     */
    public function validationDefault(Validator $validator)
    {
        $validator
            ->integer('id')
            ->allowEmptyString('id', null, 'create');

        $validator
            ->scalar('nome')
            ->maxLength('nome', 200)
            ->requirePresence('nome', 'create')
            ->notEmptyString('nome');

        $validator
            ->date('anoLancamento')
            ->requirePresence('anoLancamento', 'create')
            ->notEmptyDate('anoLancamento');

        $validator
            ->numeric('precoLocacao')
            ->requirePresence('precoLocacao', 'create')
            ->notEmptyString('precoLocacao');

        $validator
            ->scalar('observacao')
            ->requirePresence('observacao', 'create')
            ->notEmptyString('observacao');

        return $validator;
    }

    /**
     * Returns a rules checker object that will be used for validating
     * application integrity.
     *
     * @param \Cake\ORM\RulesChecker $rules The rules object to be modified.
     * @return \Cake\ORM\RulesChecker
     */
    public function buildRules(RulesChecker $rules)
    {
        $rules->add($rules->existsIn(['modelo_id'], 'Modelos'));

        return $rules;
    }
}
