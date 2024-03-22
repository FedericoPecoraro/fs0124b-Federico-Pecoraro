import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AudiComponent } from './audi.component';

describe('AudiComponent', () => {
  let component: AudiComponent;
  let fixture: ComponentFixture<AudiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AudiComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AudiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
