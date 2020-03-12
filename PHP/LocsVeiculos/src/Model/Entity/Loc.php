<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Loc Entity
 *
 * @property int $id
 * @property \Cake\I18n\FrozenTime $dataLocs
 * @property \Cake\I18n\FrozenTime $dataDevolucao
 * @property int $pagamento_id
 * @property int $cliente_id
 * @property int $funcionario_id
 * @property int $carro_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime $modified
 *
 * @property \App\Model\Entity\Pagamento[] $pagamentos
 * @property \App\Model\Entity\Cliente[] $clientes
 * @property \App\Model\Entity\Funcionario[] $funcionarios
 * @property \App\Model\Entity\Inventario[] $inventarios
 */
class Loc extends Entity
{
    /**
     * Fields that can be mass assigned using newEntity() or patchEntity().
     *
     * Note that when '*' is set to true, this allows all unspecified fields to
     * be mass assigned. For security purposes, it is advised to set '*' to false
     * (or remove it), and explicitly make individual fields accessible as needed.
     *
     * @var array
     */
    protected $_accessible = [
        'dataLocs' => true,
        'dataDevolucao' => true,
        'pagamento_id' => true,
        'cliente_id' => true,
        'funcionario_id' => true,
        'carro_id' => true,
        'created' => true,
        'modified' => true,
        'pagamentos' => true,
        'clientes' => true,
        'funcionarios' => true,
        'inventarios' => true
    ];
}
