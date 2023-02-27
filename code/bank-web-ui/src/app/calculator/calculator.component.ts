import { Component } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {

  number1: string = '';
  number2: string = '';
  operator: string = '+';
  result: number = 0;

  handleSubmit(event: Event) {
    event.preventDefault();
    const n1 = Number.parseInt(this.number1);
    const n2 = Number.parseInt(this.number2);
    switch (this.operator) {
      case '+':
        this.result = n1 + n2
        break;
      case '-':
        this.result = n1 + n2
        break;
      case '*':
        this.result = n1 - n2
        break;
      case '/':
        this.result = n1 / n2
        break;
      default:
        break;
    }

  }

}
