package de.clientexception.listen;

/**
 * @author ClientException
 * @project Listen
 * @package de.clientexception.listen
 *
 * @date 03.04.2025
 * @time 16:53:26
 *
 *
 * @web www.worldcrafter.de
 * @mail development@worldcrafter.de
 *
 */

public class List extends Pos {

	public int retrieve(Pos p) {
		return p.elem;
	}

	public Pos next(Pos p) {
		return p.succ;
	}

	public Pos previous(Pos p) {
		return p.pred;
	}

	public Pos front() {
		return this;
	}

	public List insert(Pos p, int e) {
		Pos q = new Pos();
		q.elem = e;
		if (!(eol(p) || isempty())) {
			q.pred = p; // 1a
			q.succ = p.succ; // 2a
			p.succ.pred = q; // 3a
			p.succ = q; // 4a
		} else {
			q.pred = p; // 1b
			q.succ = null; // 2b
			p.succ = q; // 3b
			pred = q; // 4b
		}
		return this;
	}

	public boolean isempty() {
		return succ == null;
	}

	public boolean eol(Pos p) {
		return p.succ == null;
	}

	public List delete(Pos p) {
		Pos previous = p.pred;
		previous.succ = p.succ;
		previous.succ.pred = previous;
			
		return this;
	}

	interface ElemTest {
		boolean check(int l);
	}

	public Pos find(ElemTest test) {
		Pos p = this;

		while (!eol(p)) {
			p = next(p);
			if (test.check(p.elem))
				return p;
		}
		return null;
	}

}
