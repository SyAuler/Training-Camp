<?php
namespace App\Model\Table;

use Cake\ORM\Query;
use Cake\ORM\RulesChecker;
use Cake\ORM\Table;
use Cake\Validation\Validator;

/**
 * Inventarios Model
 *
 * @property \App\Model\Table\CarrosTable|\Cake\ORM\Association\BelongsTo $Carros
 * @property \App\Model\Table\LojasTable|\Cake\ORM\Association\BelongsTo $Lojas
 * @property \App\Model\Table\LocsTable|\Cake\ORM\Association\BelongsTo $Locs
 * @property \App\Model\Table\LocsTable|\Cake\ORM\Association\HasMany $Locs
 * @property \App\Model\Table\LojasTable|\Cake\ORM\Association\HasMany $Lojas
 *
 * @method \App\Model\Entity\Inventario get($primaryKey, $options = [])
 * @method \App\Model\Entity\Inventario newEntity($data = null, array $options = [])
 * @method \App\Model\Entity\Inventario[] newEntities(array $data, array $options = [])
 * @method \App\Model\Entity\Inventario|bool save(\Cake\Datasource\EntityInterface $entity, $options = [])
 * @method \App\Model\Entity\Inventario saveOrFail(\Cake\Datasource\EntityInterface $entity, $options = [])
 * @method \App\Model\Entity\Inventario patchEntity(\Cake\Datasource\EntityInterface $entity, array $data, array $options = [])
 * @method \App\Model\Entity\Inventario[] patchEntities($entities, array $data, array $options = [])
 * @method \App\Model\Entity\Inventario findOrCreate($search, callable $callback = null, $options = [])
 *
 * @mixin \Cake\ORM\Behavior\TimestampBehavior
 */
class InventariosTable extends Table
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

        $this->setTable('inventarios');
        $this->setDisplayField('id');
        $this->setPrimaryKey('id');

        $this->addBehavior('Timestamp');

        $this->belongsTo('Carros', [
            'foreignKey' => 'carro_id',
            'joinType' => 'INNER'
        ]);
        $this->belongsTo('Lojas', [
            'foreignKey' => 'loja_id',
            'joinType' => 'INNER'
        ]);
        $this->belongsTo('Locs', [
            'foreignKey' => 'loc_id',
            'joinType' => 'INNER'
        ]);
        $this->hasMany('Locs', [
            'foreignKey' => 'inventario_id'
        ]);
        $this->hasMany('Lojas', [
            'foreignKey' => 'inventario_id'
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
        $rules->add($rules->existsIn(['carro_id'], 'Carros'));
        $rules->add($rules->existsIn(['loja_id'], 'Lojas'));
        $rules->add($rules->existsIn(['loc_id'], 'Locs'));

        return $rules;
    }
}
