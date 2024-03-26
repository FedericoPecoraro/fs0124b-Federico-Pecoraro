import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'maiusc'
})
export class MaiuscPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
