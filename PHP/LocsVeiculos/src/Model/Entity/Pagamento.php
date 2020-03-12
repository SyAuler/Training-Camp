<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Pagamento Entity
 *
 * @property int $id
 * @property float $valor
 * @property \Cake\I18n\FrozenDate $dataPagamento
 * @property int $loc_id
 * @property int $cliente_id
 * @property int $funcionario_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime|null $modified
 *
 * @property \App\Model\Entity\Loc[] $locs
 * @property \App\Model\Entity\Cliente[] $clientes
 * @property \App\Model\Entity\Funcionario $funcionario
 */
class Pagamento extends Entity
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
        'valor' => true,
        'dataPagamento' => true,
        'loc_id' => true,
        'cliente_id' => true,
        'funcionario_id' => true,
        'created' => true,
        'modified' => true,
        'locs' => true,
        'clientes' => true,
        'funcionario' => true
    ];
}
