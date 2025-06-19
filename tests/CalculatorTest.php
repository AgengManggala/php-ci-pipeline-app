<?php

use PHPUnit\Framework\TestCase;
use MyApp\Calculator;

class CalculatorTest extends TestCase
{
    public function testAddition()
    {
        $calc = new Calculator();
        $this->assertEquals(6, $calc->add(4, 2));
    }

    public function testSubtraction()
    {
        $calc = new Calculator();
        $this->assertEquals(2, $calc->subtract(5, 3));
    }
}
