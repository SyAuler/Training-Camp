<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Rule $rule
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Form->postLink(
                __('Delete'),
                ['action' => 'delete', $rule->id],
                ['confirm' => __('Are you sure you want to delete # {0}?', $rule->id)]
            )
        ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="rules form large-9 medium-8 columns content">
    <?= $this->Form->create($rule) ?>
    <fieldset>
        <legend><?= __('Edit Rule') ?></legend>
        <?php
            echo $this->Form->control('rules');
            echo $this->Form->control('user_id');
        ?>
    </fieldset>
    <?= $this->Form->button(__('Submit')) ?>
    <?= $this->Form->end() ?>
</div>
