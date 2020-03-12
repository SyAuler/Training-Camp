<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Loc $loc
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Loc'), ['action' => 'edit', $loc->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Loc'), ['action' => 'delete', $loc->id], ['confirm' => __('Are you sure you want to delete # {0}?', $loc->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Locs'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Loc'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="locs view large-9 medium-8 columns content">
    <h3><?= h($loc->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($loc->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Pagamento Id') ?></th>
            <td><?= $this->Number->format($loc->pagamento_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Cliente Id') ?></th>
            <td><?= $this->Number->format($loc->cliente_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Funcionario Id') ?></th>
            <td><?= $this->Number->format($loc->funcionario_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Carro Id') ?></th>
            <td><?= $this->Number->format($loc->carro_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('DataLocs') ?></th>
            <td><?= h($loc->dataLocs) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('DataDevolucao') ?></th>
            <td><?= h($loc->dataDevolucao) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($loc->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($loc->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Pagamentos') ?></h4>
        <?php if (!empty($loc->pagamentos)): ?>
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
            <?php foreach ($loc->pagamentos as $pagamentos): ?>
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
    <div class="related">
        <h4><?= __('Related Clientes') ?></h4>
        <?php if (!empty($loc->clientes)): ?>
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
            <?php foreach ($loc->clientes as $clientes): ?>
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
        <h4><?= __('Related Funcionarios') ?></h4>
        <?php if (!empty($loc->funcionarios)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Nome') ?></th>
                <th scope="col"><?= __('User Id') ?></th>
                <th scope="col"><?= __('Endereco Id') ?></th>
                <th scope="col"><?= __('Loja Id') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($loc->funcionarios as $funcionarios): ?>
            <tr>
                <td><?= h($funcionarios->id) ?></td>
                <td><?= h($funcionarios->nome) ?></td>
                <td><?= h($funcionarios->user_id) ?></td>
                <td><?= h($funcionarios->endereco_id) ?></td>
                <td><?= h($funcionarios->loja_id) ?></td>
                <td><?= h($funcionarios->loc_id) ?></td>
                <td><?= h($funcionarios->created) ?></td>
                <td><?= h($funcionarios->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Funcionarios', 'action' => 'view', $funcionarios->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Funcionarios', 'action' => 'edit', $funcionarios->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Funcionarios', 'action' => 'delete', $funcionarios->id], ['confirm' => __('Are you sure you want to delete # {0}?', $funcionarios->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Inventarios') ?></h4>
        <?php if (!empty($loc->inventarios)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Carro Id') ?></th>
                <th scope="col"><?= __('Loja Id') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($loc->inventarios as $inventarios): ?>
            <tr>
                <td><?= h($inventarios->id) ?></td>
                <td><?= h($inventarios->carro_id) ?></td>
                <td><?= h($inventarios->loja_id) ?></td>
                <td><?= h($inventarios->loc_id) ?></td>
                <td><?= h($inventarios->created) ?></td>
                <td><?= h($inventarios->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Inventarios', 'action' => 'view', $inventarios->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Inventarios', 'action' => 'edit', $inventarios->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Inventarios', 'action' => 'delete', $inventarios->id], ['confirm' => __('Are you sure you want to delete # {0}?', $inventarios->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
</div>
