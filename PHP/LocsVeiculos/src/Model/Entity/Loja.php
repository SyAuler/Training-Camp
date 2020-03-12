<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Loja Entity
 *
 * @property int $id
 * @property string $nome
 * @property int $funcionario_id
 * @property int $inventario_id
 * @property int $endereco_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime $modified
 *
 * @property \App\Model\Entity\Funcionario[] $funcionarios
 * @property \App\Model\Entity\Inventario[] $inventarios
 * @property \App\Model\Entity\Endereco $endereco
 */
class Loja extends Entity
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
        'funcionario_id' => true,
        'inventario_id' => true,
        'endereco_id' => true,
        'created' => true,
        'modified' => true,
        'funcionarios' => true,
        'inventarios' => true,
        'endereco' => true
    ];
}
