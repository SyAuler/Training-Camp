<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Funcionario $funcionario
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Funcionario'), ['action' => 'edit', $funcionario->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Funcionario'), ['action' => 'delete', $funcionario->id], ['confirm' => __('Are you sure you want to delete # {0}?', $funcionario->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Funcionario'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="funcionarios view large-9 medium-8 columns content">
    <h3><?= h($funcionario->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Nome') ?></th>
            <td><?= h($funcionario->nome) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('User') ?></th>
            <td><?= $funcionario->has('user') ? $this->Html->link($funcionario->user->id, ['controller' => 'Users', 'action' => 'view', $funcionario->user->id]) : '' ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($funcionario->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Endereco Id') ?></th>
            <td><?= $this->Number->format($funcionario->endereco_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Loja Id') ?></th>
            <td><?= $this->Number->format($funcionario->loja_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Loc Id') ?></th>
            <td><?= $this->Number->format($funcionario->loc_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($funcionario->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($funcionario->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Enderecos') ?></h4>
        <?php if (!empty($funcionario->enderecos)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Endereco') ?></th>
                <th scope="col"><?= __('Numero') ?></th>
                <th scope="col"><?= __('Bairro') ?></th>
                <th scope="col"><?= __('Cep') ?></th>
                <th scope="col"><?= __('Telefone') ?></th>
                <th scope="col"><?= __('Cidade Id') ?></th>
                <th scope="col"><?= __('Cliente Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($funcionario->enderecos as $enderecos): ?>
            <tr>
                <td><?= h($enderecos->id) ?></td>
                <td><?= h($enderecos->endereco) ?></td>
                <td><?= h($enderecos->numero) ?></td>
                <td><?= h($enderecos->bairro) ?></td>
                <td><?= h($enderecos->cep) ?></td>
                <td><?= h($enderecos->telefone) ?></td>
                <td><?= h($enderecos->cidade_id) ?></td>
                <td><?= h($enderecos->cliente_id) ?></td>
                <td><?= h($enderecos->funcionario_id) ?></td>
                <td><?= h($enderecos->created) ?></td>
                <td><?= h($enderecos->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Enderecos', 'action' => 'view', $enderecos->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Enderecos', 'action' => 'edit', $enderecos->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Enderecos', 'action' => 'delete', $enderecos->id], ['confirm' => __('Are you sure you want to delete # {0}?', $enderecos->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Lojas') ?></h4>
        <?php if (!empty($funcionario->lojas)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Nome') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Inventario Id') ?></th>
                <th scope="col"><?= __('Endereco Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($funcionario->lojas as $lojas): ?>
            <tr>
                <td><?= h($lojas->id) ?></td>
                <td><?= h($lojas->nome) ?></td>
                <td><?= h($lojas->funcionario_id) ?></td>
                <td><?= h($lojas->inventario_id) ?></td>
                <td><?= h($lojas->endereco_id) ?></td>
                <td><?= h($lojas->created) ?></td>
                <td><?= h($lojas->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Lojas', 'action' => 'view', $lojas->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Lojas', 'action' => 'edit', $lojas->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Lojas', 'action' => 'delete', $lojas->id], ['confirm' => __('Are you sure you want to delete # {0}?', $lojas->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Locs') ?></h4>
        <?php if (!empty($funcionario->locs)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('DataLocs') ?></th>
                <th scope="col"><?= __('DataDevolucao') ?></th>
                <th scope="col"><?= __('Pagamento Id') ?></th>
                <th scope="col"><?= __('Cliente Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Inventario Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($funcionario->locs as $locs): ?>
            <tr>
                <td><?= h($locs->id) ?></td>
                <td><?= h($locs->dataLocs) ?></td>
                <td><?= h($locs->dataDevolucao) ?></td>
                <td><?= h($locs->pagamento_id) ?></td>
                <td><?= h($locs->cliente_id) ?></td>
                <td><?= h($locs->funcionario_id) ?></td>
                <td><?= h($locs->inventario_id) ?></td>
                <td><?= h($locs->created) ?></td>
                <td><?= h($locs->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Locs', 'action' => 'view', $locs->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Locs', 'action' => 'edit', $locs->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Locs', 'action' => 'delete', $locs->id], ['confirm' => __('Are you sure you want to delete # {0}?', $locs->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Clientes') ?></h4>
        <?php if (!empty($funcionario->clientes)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Nome') ?></th>
                <th scope="col"><?= __('Cpf') ?></th>
                <th scope="col"><?= __('Email') ?></th>
                <th scope="col"><?= __('Endereco Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Pagamento Id') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($funcionario->clientes as $clientes): ?>
            <tr>
                <td><?= h($clientes->id) ?></td>
                <td><?= h($clientes->nome) ?></td>
                <td><?= h($clientes->cpf) ?></td>
                <td><?= h($clientes->email) ?></td>
                <td><?= h($clientes->endereco_id) ?></td>
                <td><?= h($clientes->funcionario_id) ?></td>
                <td><?= h($clientes->pagamento_id) ?></td>
                <td><?= h($clientes->loc_id) ?></td>
                <td><?= h($clientes->created) ?></td>
                <td><?= h($clientes->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Clientes', 'action' => 'view', $clientes->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Clientes', 'action' => 'edit', $clientes->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Clientes', 'action' => 'delete', $clientes->id], ['confirm' => __('Are you sure you want to delete # {0}?', $clientes->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Pagamentos') ?></h4>
        <?php if (!empty($funcionario->pagamentos)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Valor') ?></th>
                <th scope="col"><?= __('DataPagamento') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Cliente Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($funcionario->pagamentos as $pagamentos): ?>
            <tr>
                <td><?= h($pagamentos->id) ?></td>
                <td><?= h($pagamentos->valor) ?></td>
                <td><?= h($pagamentos->dataPagamento) ?></td>
                <td><?= h($pagamentos->loc_id) ?></td>
                <td><?= h($pagamentos->cliente_id) ?></td>
                <td><?= h($pagamentos->funcionario_id) ?></td>
                <td><?= h($pagamentos->created) ?></td>
                <td><?= h($pagamentos->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Pagamentos', 'action' => 'view', $pagamentos->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Pagamentos', 'action' => 'edit', $pagamentos->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Pagamentos', 'action' => 'delete', $pagamentos->id], ['confirm' => __('Are you sure you want to delete # {0}?', $pagamentos->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
</div>
