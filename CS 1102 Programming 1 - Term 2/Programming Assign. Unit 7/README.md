Given a square matrix m[3x3], create a java code to calculate the value of its SECONDARY Diagonal. See example below.

Hint: In order to better understand the concepts involved in this exercises, research the terms “square matrix” and “secondary diagonal of a matrix” using your favourite search engine.

Example given matrix m[3x3] shown below:

<div class="responsive">
<table class="table table-condensed">
<tbody>
<tr>
<td>(0,0) (0,1) (0,2)</td>
<td>|</td>
<td>10 &emsp; 12 &emsp;11</td>
</tr>
<tr>
<td>(1,0) (1,1) (1,2)</td>
<td>|</td>
<td>9 &emsp; 8 &emsp; 31</td>
</tr>
<tr>
<td>(2,0) (2,1) (2,2)</td>
<td>|</td>
<td>2 &emsp; 16 &emsp;24</td>
</tr>
</tbody>
</table>
</div>

Secondary Diagonal (generic m[3x3]) = m[0,2] + m[1,1] + m[2,0]
Secondary Diagonal (as in the example above) = 11 + 8 + 2 = 21

Note 1: Your java code MUST be GENERIC to calculate the secondary diagonal of ANY square matrix [2x2], [3x3],[4x4], etc. (Use a constant in your code to set the values of numberOfRows and numberOfColumns of your matrix.

Note 2: Your matrix m may be hardcoded (no need of user interaction)

Note 3: In case numberOfRows and numberOfColumns ar differents, your program must display the following message: “This is not a square matrix.”
