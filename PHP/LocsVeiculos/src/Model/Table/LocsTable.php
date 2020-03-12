<?php
namespace App\Model\Table;

use Cake\ORM\Query;
use Cake\ORM\RulesChecker;
use Cake\ORM\Table;
use Cake\Validation\Validator;

/**
 * Locs Model
 *
 * @property \App\Model\Table\PagamentosTable|\Cake\ORM\Association\BelongsTo $Pagamentos
 * @property \App\Model\Table\ClientesTable|\Cake\ORM\Association\BelongsTo $Clientes
 * @property \App\Model\Table\FuncionariosTable|\Cake\ORM\Association\BelongsTo $Funcionarios
 * @property |\Cake\ORM\Association\BelongsTo $Carros
 * @property \App\Model\Table\ClientesTable|\Cake\ORM\Association\HasMany $Clientes
 * @property \App\Model\Table\FuncionariosTable|\Cake\ORM\Association\HasMany $Funcionarios
 * @property \App\Model\Table\InventariosTable|\Cake\ORM\Association\HasMany $Inventarios
 * @property \App\Model\Table\PagamentosTable|\Cake\ORM\Association\HasMany $Pagamentos
 *
 * @method \App\Model\Entity\Loc get($primaryKey, $options = [])
 * @method \App\Model\Entity\Loc newEntity($data = null, array $options = [])
 * @method \App\Model\Entity\Loc[] newEntities(array $data, array $options = [])
 * @method \App\Model\Entity\Loc|bool save(\Cake\Datasource\EntityInterface $entity, $options = [])
 * @method \App\Model\Entity\Loc saveOrFail(\Cake\Datasource\EntityInterface $entity, $options = [])
 * @method \App\Model\Entity\Loc patchEntity(\Cake\Datasource\EntityInterface $entity, array $data, array $options = [])
 * @method \App\Model\Entity\Loc[] patchEntities($entities, array $data, array $options = [])
 * @method \App\Model\Entity\Loc findOrCreate($search, callable $callback = null, $options = [])
 *
 * @mixin \Cake\ORM\Behavior\TimestampBehavior
 */
class LocsTable extends Table
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

        $this->setTable('locs');
        $this->setDisplayField('id');
        $this->setPrimaryKey('id');

        $this->addBehavior('Timestamp');

        $this->belongsTo('Pagamentos', [
            'foreignKey' => 'pagamento_id',
            'joinType' => 'INNER'
        ]);
        $this->belongsTo('Clientes', [
            'foreignKey' => 'cliente_id',
            'joinType' => 'INNER'
        ]);
        $this->belongsTo('Funcionarios', [
            'foreignKey' => 'funcionario_id',
            'joinType' => 'INNER'
        ]);
        $this->belongsTo('Carros', [
            'foreignKey' => 'carro_id',
            'joinType' => 'INNER'
        ]);
        $this->hasMany('Clientes', [
            'foreignKey' => 'loc_id'
        ]);
        $this->hasMany('Funcionarios', [
            'foreignKey' => 'loc_id'
        ]);
        $this->hasMany('Inventarios', [
            'foreignKey' => 'loc_id'
        ]);
        $this->hasMany('Pagamentos', [
            'foreignKey' => 'loc_id'
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
            ->dateTime('dataLocs')
            ->requirePresence('dataLocs', 'create')
            ->notEmptyDateTime('dataLocs');

        $validator
            ->dateTime('dataDevolucao')
            ->requirePresence('dataDevolucao', 'create')
            ->notEmptyDateTime('dataDevolucao');

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
        $rules->add($rules->existsIn(['pagamento_id'], 'Pagamentos'));
        $rules->add($rules->existsIn(['cliente_id'], 'Clientes'));
        $rules->add($rules->existsIn(['funcionario_id'], 'Funcionarios'));
        $rules->add($rules->existsIn(['carro_id'], 'Carros'));

        return $rules;
    }
}
