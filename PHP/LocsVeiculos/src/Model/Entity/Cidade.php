<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Cidade Entity
 *
 * @property int $id
 * @property string $cidade
 * @property int $paise_id
 * @property int $endereco_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime $modified
 *
 * @property \App\Model\Entity\Paise[] $paises
 * @property \App\Model\Entity\Endereco[] $enderecos
 */
class Cidade extends Entity
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
        'cidade' => true,
        'paise_id' => true,
        'endereco_id' => true,
        'created' => true,
        'modified' => true,
        'paises' => true,
        'enderecos' => true
    ];
}
