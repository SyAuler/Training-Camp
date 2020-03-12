<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Carro Entity
 *
 * @property int $id
 * @property string $nome
 * @property int $modelo_id
 * @property \Cake\I18n\FrozenDate $anoLancamento
 * @property float $precoLocacao
 * @property string $observacao
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime|null $modified
 *
 * @property \App\Model\Entity\Modelo[] $modelos
 * @property \App\Model\Entity\Inventario[] $inventarios
 */
class Carro extends Entity
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
        'nome' => true,
        'modelo_id' => true,
        'anoLancamento' => true,
        'precoLocacao' => true,
        'observacao' => true,
        'created' => true,
        'modified' => true,
        'modelos' => true,
        'inventarios' => true
    ];
}
