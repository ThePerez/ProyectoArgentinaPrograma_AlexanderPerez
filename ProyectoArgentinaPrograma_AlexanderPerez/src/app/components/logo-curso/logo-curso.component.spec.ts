import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoCursoComponent } from './logo-curso.component';

describe('LogoCursoComponent', () => {
  let component: LogoCursoComponent;
  let fixture: ComponentFixture<LogoCursoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoCursoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoCursoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
