<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Endereco Entity
 *
 * @property int $id
 * @property string $endereco
 * @property int $numero
 * @property string $bairro
 * @property string $cep
 * @property string $telefone
 * @property int $cidade_id
 * @property int $cliente_id
 * @property int $funcionario_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime|null $modified
 *
 * @property \App\Model\Entity\Cidade[] $cidades
 * @property \App\Model\Entity\Cliente[] $clientes
 * @property \App\Model\Entity\Funcionario[] $funcionarios
 * @property \App\Model\Entity\Loja[] $lojas
 */
class Endereco extends Entity
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
        'endereco' => true,
        'numero' => true,
        'bairro' => true,
        'cep' => true,
        'telefone' => true,
        'cidade_id' => true,
        'cliente_id' => true,
        'funcionario_id' => true,
        'created' => true,
        'modified' => true,
        'cidades' => true,
        'clientes' => true,
        'funcionarios' => true,
        'lojas' => true
    ];
}
