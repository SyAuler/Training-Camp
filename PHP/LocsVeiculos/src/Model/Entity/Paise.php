<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Paise Entity
 *
 * @property int $id
 * @property string $pais
 * @property int $cidade_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime|null $modified
 *
 * @property \App\Model\Entity\Cidade[] $cidades
 */
class Paise extends Entity
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
        'pais' => true,
        'cidade_id' => true,
        'created' => true,
        'modified' => true,
        'cidades' => true
    ];
}
