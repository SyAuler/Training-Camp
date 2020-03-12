<?php
namespace App\Model\Entity;

use Cake\ORM\Entity;

/**
 * Cliente Entity
 *
 * @property int $id
 * @property string $nome
 * @property string $cpf
 * @property string $email
 * @property int $endereco_id
 * @property int $funcionario_id
 * @property int $pagamento_id
 * @property int $loc_id
 * @property \Cake\I18n\FrozenTime|null $created
 * @property \Cake\I18n\FrozenTime $modified
 *
 * @property \App\Model\Entity\Endereco[] $enderecos
 * @property \App\Model\Entity\Funcionario $funcionario
 * @property \App\Model\Entity\Pagamento[] $pagamentos
 * @property \App\Model\Entity\Loc[] $locs
 */
class Cliente extends Entity
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
        'cpf' => true,
        'email' => true,
        'endereco_id' => true,
        'funcionario_id' => true,
        'pagamento_id' => true,
        'loc_id' => true,
        'created' => true,
        'modified' => true,
        'enderecos' => true,
        'funcionario' => true,
        'pagamentos' => true,
        'locs' => true
    ];
}
