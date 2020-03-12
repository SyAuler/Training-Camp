<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Inventario Entity
 *
 * @property int $id
 * @property int $carro_id
 * @property int $loja_id
 * @property int $loc_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime|null $modified
 *
 * @property \App\Model\Entity\Carro $carro
 * @property \App\Model\Entity\Loja[] $lojas
 * @property \App\Model\Entity\Loc[] $locs
 */
class Inventario extends Entity
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
        'carro_id' => true,
        'loja_id' => true,
        'loc_id' => true,
        'created' => true,
        'modified' => true,
        'carro' => true,
        'lojas' => true,
        'locs' => true
    ];
}
