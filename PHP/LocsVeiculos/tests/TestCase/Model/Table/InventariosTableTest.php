<?php
namespace App\Test\TestCase\Model\Table;

use App\Model\Table\InventariosTable;
use Cake\ORM\TableRegistry;
use Cake\TestSuite\TestCase;

/**
 * App\Model\Table\InventariosTable Test Case
 */
class InventariosTableTest extends TestCase
{
    /**
     * Test subject
     *
     * @var \App\Model\Table\InventariosTable
     */
    public $Inventarios;

    /**
     * Fixtures
     *
     * @var array
     */
    public $fixtures = [
        'app.Inventarios',
        'app.Carros',
        'app.Lojas',
        'app.Locs'
    ];

    /**
     * setUp method
     *
     * @return void
     */
    public function setUp()
    {
        parent::setUp();
        $config = TableRegistry::getTableLocator()->exists('Inventarios') ? [] : ['className' => InventariosTable::class];
        $this->Inventarios = TableRegistry::getTableLocator()->get('Inventarios', $config);
    }

    /**
     * tearDown method
     *
     * @return void
     */
    public function tearDown()
    {
        unset($this->Inventarios);

        parent::tearDown();
    }

    /**
     * Test initialize method
     *
     * @return void
     */
    public function testInitialize()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }

    /**
     * Test validationDefault method
     *
     * @return void
     */
    public function testValidationDefault()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }

    /**
     * Test buildRules method
     *
     * @return void
     */
    public function testBuildRules()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }
}
