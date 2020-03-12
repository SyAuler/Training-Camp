<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Funcionario Entity
 *
 * @property int $id
 * @property string $nome
 * @property int $user_id
 * @property int $endereco_id
 * @property int $loja_id
 * @property int $loc_id
 * @property \Cake\I18n\FrozenTime $created
 * @property \Cake\I18n\FrozenTime|null $modified
 *
 * @property \App\Model\Entity\User $user
 * @property \App\Model\Entity\Endereco[] $enderecos
 * @property \App\Model\Entity\Loja[] $lojas
 * @property \App\Model\Entity\Loc[] $locs
 * @property \App\Model\Entity\Cliente[] $clientes
 * @property \App\Model\Entity\Pagamento[] $pagamentos
 */
class Funcionario extends Entity
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
        'user_id' => true,
        'endereco_id' => true,
        'loja_id' => true,
        'loc_id' => true,
        'created' => true,
        'modified' => true,
        'user' => true,
        'enderecos' => true,
        'lojas' => true,
        'locs' => true,
        'clientes' => true,
        'pagamentos' => true
    ];
}
