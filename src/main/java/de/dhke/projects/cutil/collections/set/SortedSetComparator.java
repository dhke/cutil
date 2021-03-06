/**
 * (c) 2009-2014 Peter Wullinger
 *
 * $Id$
 *
 * Use, modification and restribution of this file are covered by the
 * terms of the Artistic License 2.0.
 *
 * You should have received a copy of the license terms in a file named
 * "LICENSE" together with this software package.
 *
 * Disclaimer of Warranty: THE PACKAGE IS PROVIDED BY THE COPYRIGHT
 * HOLDER AND CONTRIBUTORS "AS IS' AND WITHOUT ANY EXPRESS OR IMPLIED
 * WARRANTIES. THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
 * A PARTICULAR PURPOSE, OR NON-INFRINGEMENT ARE DISCLAIMED TO THE
 * EXTENT PERMITTED BY YOUR LOCAL LAW. UNLESS REQUIRED BY LAW, NO
 * COPYRIGHT HOLDER OR CONTRIBUTOR WILL BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES ARISING IN ANY WAY OUT
 * OF THE USE OF THE PACKAGE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 **/
package de.dhke.projects.cutil.collections.set;

import de.dhke.projects.cutil.Pair;
import de.dhke.projects.cutil.collections.iterator.PairIterable;
import java.util.Comparator;
import java.util.SortedSet;

/**
 *
 * @author Peter Wullinger <java@dhke.de>
 */
public class SortedSetComparator<T extends Comparable<? super T>, S extends SortedSet<T>>
	implements Comparator<S>
{
	@Override
	public int compare(S o1, S o2)
	{
		int compare = 0;
		for (Pair<T, T> pair: PairIterable.wrap(o1, o2)) {
			compare = pair.getFirst().compareTo(pair.getSecond());
			if (compare != 0)
				return compare; 
		}
		assert compare == 0;
		return compare;
	}

}
