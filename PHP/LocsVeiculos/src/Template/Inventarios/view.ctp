<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Inventario $inventario
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Inventario'), ['action' => 'edit', $inventario->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Inventario'), ['action' => 'delete', $inventario->id], ['confirm' => __('Are you sure you want to delete # {0}?', $inventario->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Inventarios'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Inventario'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="inventarios view large-9 medium-8 columns content">
    <h3><?= h($inventario->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Carro') ?></th>
            <td><?= $inventario->has('carro') ? $this->Html->link($inventario->carro->id, ['controller' => 'Carros', 'action' => 'view', $inventario->carro->id]) : '' ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($inventario->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Loja Id') ?></th>
            <td><?= $this->Number->format($inventario->loja_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Loc Id') ?></th>
            <td><?= $this->Number->format($inventario->loc_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($inventario->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($inventario->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Lojas') ?></h4>
        <?php if (!empty($inventario->lojas)): ?>
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
            <?php foreach ($inventario->lojas as $lojas): ?>
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
        <?php if (!empty($inventario->locs)): ?>
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
            <?php foreach ($inventario->locs as $locs): ?>
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
</div>
