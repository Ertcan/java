package odev;

public class KabaSiralama {
	public static void main(String[] args) {
		long startTime = System.nanoTime(); 
		// Ba�lang�� Zaman�
		int temp;
		int[] dizi = {758, 8357, 8119, 8848, 3908, 7247, 9833, 6113, 4131, 3401, 428, 354, 8267, 5998, 2127, 8824, 9413, 9631, 2491,
				5825, 3791, 4875, 7002, 7155, 3849, 7753, 7526, 8473, 9193, 3422, 4710, 8514, 8302, 3780, 5443, 1862, 7772, 8496,
				8446, 9876, 6336, 8745, 1756, 562, 7623, 7965, 7370, 8676, 9272, 8992, 3629, 4393, 4437, 9925, 225, 863, 3328, 9595,
				352, 8311, 7314, 5974, 3425, 578, 3161, 2025, 2988, 1352, 5879, 6289, 2077, 8470, 8719, 6620, 762, 2682, 9480, 8216,
				4271, 5930, 978, 2198, 4603, 1106, 9039, 2582, 681, 4449, 4909, 8916, 6088, 3383, 4434, 8765, 6513, 7786, 8982, 9993,
				5900, 3020, 201, 1954, 5618, 4354, 5807, 4152, 5307, 8094, 8975, 5068, 9810, 3210, 9055, 2650, 6762, 1431, 6815, 2, 63,
				8138, 6024, 5181, 4087, 6840, 554, 8630, 8768, 4398, 4345, 2027, 3873, 3014, 7974, 598, 5508, 6895, 864, 3234, 9620, 8991,
				2611, 1647, 9316, 7682, 4320, 2264, 6739, 8346, 1333, 121, 3013, 9417, 4464, 5865, 5585, 3204, 7309, 8611, 3550, 1999, 7978,
				501, 7876, 5808, 5648, 5301, 9017, 6198, 9412, 8928, 343, 5444, 8986, 3277, 8639, 6523, 7117, 3063, 7658, 9260, 3674, 7470,
				6103, 442, 2602, 8552, 4517, 8754, 3315, 5645, 3784, 2213, 2357, 4265, 6041, 4151, 4888, 3045, 9153, 6587, 1456, 1618, 6011,
				2807, 2412, 7462, 2447, 9829, 7075, 4209, 5543, 35, 2179, 1434, 6729, 4739, 948, 5664, 9690, 524, 9315, 4429, 373, 4602, 4685,
				2894, 7219, 3785, 5273, 8484, 4359, 2966, 499, 4963, 7994, 1117, 5088, 898, 4588, 2390, 5984, 8845, 4831, 4165, 6691, 9128, 7707,
				9279, 7652, 2356, 9750, 2053, 3595, 4047, 4944, 4891, 1258, 6550, 6722, 850, 3814, 1127, 9984, 7173, 6320, 638, 7473, 4794, 8527,
				7141, 3501, 6478, 1147, 1834, 2293, 9147, 6416, 5289, 6394, 4190, 8906, 5139, 9283, 6187, 1880, 2947, 9099, 5305, 1329, 3106, 518,
				2165, 3280, 4832, 2589, 3222, 2361, 1043, 9957, 3861, 4971, 7844, 6810, 1271, 5462, 4309, 9022, 6063, 8309, 2185, 894, 5335, 4126,
				7217, 9769, 1238, 6022, 6354, 3464, 4064, 4717, 7081, 4757, 5313, 2507, 800, 7757, 594, 517, 9109, 2296, 9926, 6747, 2559, 1506,
				6391, 5423, 2669, 5184, 2326, 337, 6137, 6268, 2143, 3655, 3214, 8124, 5116, 7681, 6081, 104, 7936, 1426, 5054, 453, 2046, 9763,
				6559, 4981, 6918, 5537, 5132, 3080, 7586, 4462, 640, 9057, 5531, 6496, 9463, 2577, 6900, 1018, 564, 288, 4261, 1209, 5637, 5643,
				6952, 8389, 7083, 5013, 4818, 350, 7146, 2931, 4648, 7409, 7725, 5221, 7699, 5859, 2073, 2292, 88, 2996, 2725, 5196, 4125, 3072,
				5461, 469, 7938, 1359, 4289, 6359, 7260, 675, 5193, 2188, 4299, 2208, 8228, 1016, 4725, 9003, 1942, 5425, 7377, 5989, 5839, 8900,
				4375, 4920, 9569, 4468, 9326, 8704, 9247, 9318, 6823, 6789, 7038, 1971, 9082, 8627, 6901, 956, 1124, 7184, 5090, 6912, 6883, 5298,
				7188, 2997, 5250, 5325, 6049, 2830, 7413, 569, 780, 2389, 7346, 8021, 9542, 5040, 9391, 4348, 8064, 938, 8193, 495, 58, 6538, 3808,
				785, 3158, 3920, 592, 9379, 507, 7734, 5471, 6801, 1218, 4734, 3494, 217, 9424, 9505, 1497, 4363, 1808, 2575, 4942, 5940, 7507, 4294,
				3575, 5827, 5359, 7233, 1629, 5113, 6096, 7873, 8871, 3887, 3200, 5675, 3709, 3548, 8944, 968, 9271, 384, 3104, 5049, 57, 2531, 6599,
				4361, 2102, 7490, 3474, 2865, 2888, 2448, 5652, 3174, 555, 5951, 5503, 7869, 1211, 4465, 3507, 271, 9344, 59, 6267, 5866, 1542, 2384,
				9237, 9362, 8234, 8732, 1563, 8282, 5588, 417, 5142, 1637, 5750, 247, 868, 4797, 74, 1525, 1355, 6177, 9409, 1072, 9006, 1247, 2949,
				1676, 1658, 6191, 1556, 5728, 4055, 6965, 6987, 3511, 6043, 5635, 4577, 8218, 3752, 6415, 6074, 6144, 4467, 1020, 4388, 4607, 7293,
				8636, 906, 8583, 3347, 241, 7547, 5568, 7334, 4081, 9305, 833, 7013, 3744, 3820, 1711, 6461, 5435, 3156, 3447, 8876, 7017, 51, 8423,
				2883, 6899, 3888, 3148, 8291, 558, 3376, 9244, 8250, 8742, 2105, 5336, 2982, 2405, 1059, 9777, 5489, 8155, 4594, 2195, 8471, 7559,
				3637, 4980, 8499, 2635, 3736, 9675, 3672, 4006, 5430, 5831, 5738, 7241, 2784, 6152, 113, 4124, 7983, 3140, 2770, 4714, 2729, 1146,
				2083, 5472, 2130, 3421, 3648, 7576, 8880, 3025, 8570, 2893, 7694, 4941, 1796, 7425, 8728, 6244, 998, 9256, 4285, 5302, 7553, 1624,
				2266, 365, 643, 3202, 2750, 6261, 4750, 7421, 7862, 3119, 6975, 5429, 1229, 2081, 3703, 4238, 5577, 8898, 5873, 464, 306, 3355, 4476,
				5099, 3933, 7554, 3122, 4110, 8693, 6363, 2018, 8696, 5603, 340, 8988, 5811, 2140, 4088, 1867, 264, 1215, 1109, 615, 8658, 16, 4984,
				8834, 1587, 8829, 8074, 3165, 3959, 5092, 2472, 7458, 9268, 5229, 8344, 9422, 5110, 381, 7899, 2967, 4768, 2460, 6197, 2224, 1860,
				2118, 5583, 5378, 1267, 5100, 6353, 3129, 155, 4824, 4643, 1509, 8763, 4305, 4009, 8275, 2867, 1300, 3852, 8101, 1074, 7807, 8760,
				7741, 1508, 5715, 3157, 9443, 9455, 6664, 924, 6652, 6960, 6014, 1852, 1197, 9958, 6797, 7023, 1709, 127, 8972, 8948, 6914, 905, 3553,
				3754, 8089, 4829, 6562, 5147, 1375, 3783, 2989, 9743, 2048, 2225, 8204, 251, 170, 4099, 427, 1895, 7489, 9173, 8073, 626, 7770, 9860,
				6032, 8894, 7777, 2596, 8486, 6611, 2184, 6421, 4066, 8417, 6723, 1223, 6725, 1766, 645, 9759, 1105, 557, 1599, 4259, 2932, 6911, 693,
				357, 2629, 6477, 4041, 8012, 8843, 2579, 2834, 2739, 3147, 7259, 2943, 380, 3977, 3199, 9748, 4262, 3801, 7574, 2722, 4803, 4843, 7795,
				2453, 9729, 8130, 1006, 2230, 9558, 7930, 7450, 1594, 3387, 7988, 3806, 3472, 9436, 2056, 1957, 6630, 8861, 1065, 5424, 3357, 1581, 7072,
				8741, 958, 5331, 1452, 726, 2239, 847, 5871, 3206, 3520, 3594, 9333, 5684, 3362, 3022, 7051, 389, 6233, 303, 1517, 4284, 1339, 5596, 7963,
				8077, 6991, 3319, 7778, 4274, 8799, 37, 2413, 2500, 8353, 5475, 9372, 610, 6163, 460, 363, 5338, 4664, 5173, 2684, 5990, 196, 7946, 3067,
				4912, 9127, 3738, 1544, 9778, 4534, 1312, 4747, 6018, 2715, 6319, 1428, 1915, 9302, 2607, 3461, 1021, 6245, 5150, 6082, 6529, 9289, 6848,
				8394, 5192, 5619, 1152, 2778, 6583, 3180, 1189, 497, 2713, 1953, 1627, 291, 1959, 729, 7040, 305, 5943, 1559, 5862, 3167, 576, 9944, 5512,
				736, 174, 1432, 4415, 3224, 1296, 5622, 5231, 1019, 8329, 6110, 3640, 4426, 7573, 7768, 9439, 3695, 3528, 8746, 1446, 3541, 9893, 7700,
				3363, 1158, 4860, 5388, 9878, 3526, 2274, 1628, 6843, 7626, 6171, 4257, 3755, 1140, 6285, 4371, 7114, 2904, 5689, 9674, 3848, 2887, 1353,
				8939, 1010, 3516, 9310, 7667, 4565, 2351, 4179, 8142, 3914, 2302, 5982, 5126, 3555, 3399, 9465, 4439, 5765, 7246, 7410, 8675, 3341, 2747,
				2393, 3821, 822, 4520, 3354, 177, 3922, 1765, 3142, 8273, 6232, 8865, 7079, 8285, 5624, 1210, 2201, 6878, 1297, 7714, 8773, 9354, 3322,
				8893, 8493, 9816, 9731, 4620, 6870, 6542, 4505, 6291, 7438, 3775, 9913, 8276, 1660, 7449, 2436, 5172, 8189, 1797, 6551, 4713, 8592, 4192,
				8780, 4485, 5452, 6984, 2257, 2898, 5644, 8317, 1753, 8917, 1750, 4424, 7380, 4030, 1174, 222, 8955, 6608, 3300, 4848, 7948, 8268, 1097,
				5823, 4726, 1683, 6347, 1068, 3734, 907, 1923, 2432, 4637, 1357, 146, 2909, 9183, 5244, 139, 1315, 7672, 3940, 416, 2871, 7080, 5723,
				8826, 7298, 6557, 6095, 4244, 156, 2816, 8171, 8964, 2121, 3051, 6430, 7858, 4795, 2705, 7817, 210, 3867, 1981, 3036, 3320, 2813, 3930,
				9707, 7500, 8270, 3230, 397, 2763, 3860, 60, 8950, 6239, 2664, 8096, 1550, 6546, 7216, 7688, 3603, 1459, 2957, 7565, 7934, 8976, 7373,
				4430, 7055, 2653, 5233, 2174, 8136, 6020, 8875, 6852, 9666, 4899, 6219, 5194, 3678, 702, 2385, 2687, 4518, 9078, 2030, 5453, 3108, 9791,
				6449, 1876, 4061, 7510, 2764, 8721, 546, 1754, 2945, 4278, 4869, 160, 4728, 6837, 9163, 1619, 9365, 6368, 2383, 516, 8420, 4533, 5389,
				4370, 6112, 2809, 8890, 2199, 9143, 7394, 6906, 4100, 6771, 7193, 5199, 3549, 3663, 2728, 9662, 1483, 5210, 5085, 8608, 5065, 7431,
				3212, 4774, 2379, 8762, 2509, 1691, 8747, 2080, 2020, 1455, 1180, 9452, 7927, 7582, 8377, 5525, 6256, 2605, 4003, 6459, 704, 7336,
				7186, 8048, 6997, 2138, 9846, 2951, 324, 6129, 2723, 9123, 6125, 4893, 9609, 3958, 7474, 3824, 9922, 2738, 3838, 9410, 3135, 8643,
				2190, 3558, 2814, 2661, 9524, 1100, 2452, 5842, 947, 5397, 5249, 5788, 7906, 6565, 9583, 1142, 1219, 2674, 9058, 4656, 3913, 3856,
				8213, 9495, 6940, 8081, 810, 8467, 285, 8252, 1199, 4633, 8364, 9267, 2683, 1761, 706, 1162, 2471, 2600, 7294, 4820, 3732, 9694,
				5703, 9725, 7280, 144, 7382, 8695, 4698, 8066, 4840, 2321, 1898, 6572, 3231, 6249, 5428, 4268, 1988, 386, 9835, 3037, 7569, 2459, 
				528, 5109, 7835, 3409, 1156, 6561, 5360, 452, 1225, 4389, 9059, 7160, 6455, 5171, 8522, 926, 7752, 5262, 1816, 2655, 9538, 8055, 4365
				, 3810, 9303, 9460, 792, 1700, 9811, 6701, 2107, 832, 4689, 1820, 7841, 5480, 7886, 8114, 4174, 7455, 1855, 6484, 3951, 9358, 3223,
				3032, 2617, 1771, 5276, 470, 8183, 6794, 9705, 93, 2246, 8445, 9108, 7174, 3816, 478, 767, 3098, 5670, 8428, 5009, 5589, 8638, 7453,
				2760, 2043, 8147, 9874, 6476, 534, 2415, 3892, 6370, 2147, 8025, 70, 2057, 9285, 6600, 2479, 8547, 8884, 9325, 9708, 666, 95, 5342, 
				1536, 4978, 6659, 9320, 3570, 7941, 8697, 2153, 4360, 1360, 3742, 796, 7237, 1377, 8604, 2853, 7278, 3391, 1878, 8418, 8370, 1600, 9462,
				5348, 6089, 8118, 1436, 5283, 6609, 8378, 3392, 7, 4251, 633, 9855, 3552, 921, 6377, 1263, 4743, 4143, 6576, 4882, 2537, 3617, 6946, 2884,
				871, 5030, 8256, 8930, 5971, 816, 8103, 8862, 4385, 5365, 43, 9385, 8140, 4395, 9995, 471, 8810, 6702, 6481, 7703, 4519, 6025, 2979,
				8458, 2200, 1695, 777, 6705, 6539, 4614, 7297, 7606, 4312, 2633, 1740, 3811, 4158, 3256, 6263, 7234, 6316, 9115, 7109, 6296, 8304, 6773,
				4376, 9314, 8403, 5214, 9194, 2282, 4595, 4402, 5464, 4510, 4964, 7984, 8004, 8744, 5699, 4353, 8651, 3255, 4861, 1588, 7372, 9842,
				7837, 21, 2599, 3124, 2769, 9063, 607, 2529, 7534, 4989, 7378, 7856, 5898, 7677, 828, 3996, 1524, 3536, 5449, 2280, 8237, 8591, 4460,
				6693, 5402, 3481, 7952, 9433, 586, 9738, 2689, 2603, 3628, 3894, 1656, 4552, 3171, 4002, 4014, 8455, 4161, 4090, 7196, 9951, 1278,
				2137, 5259, 952, 2686, 9343, 9968, 3088, 7461, 807, 5220, 7353, 8936, 3916, 5077, 8427, 5042, 5901, 9902, 2758, 4632, 7274, 9910, 7277,
				8601, 993, 5043, 1257, 6970, 8192, 5398, 8032, 7254, 4297, 2732, 2284, 4487, 7522, 6505, 9178, 2622, 9629, 6540, 8778, 5477, 563, 7267,
				345, 4115, 714, 2628, 6048, 6460, 7602, 6530, 8135, 7492, 9589, 2707, 7959, 2836, 9254, 8320, 5516, 6791, 5774, 6865, 9912, 6671, 3041,
				7638, 2886, 4847, 692, 3021, 4628, 8150, 292, 7960, 2062, 2735, 1320, 9529, 5129, 5837, 989, 5268, 3618, 8416, 7104, 9906, 6419, 9950,
				9243, 4060, 8385, 6382, 7115, 5000, 233, 2952, 7393, 8814, 8249, 399, 9594, 8338, 5282, 2847, 7964, 4249, 1667, 1762, 1231, 6162, 5838,
				8561, 9394, 6667, 9861, 9426, 8366, 9117, 1237, 3265, 7089, 6913, 6042, 541, 2860, 8342, 3365, 2112, 7513, 5105, 4560, 873, 9328, 2183,
				6046, 2515, 9691, 4531, 1901, 4202, 6592, 8521, 7211, 5894, 7588, 6362, 3103, 8086, 1070, 4655, 698, 9916, 2207, 2677, 6595, 4760, 6389,
				5867, 5481, 8298, 1914, 3489, 4076, 7882, 2910, 8516, 3589, 3348, 9975, 9785, 132, 7591, 9423, 5010, 5884, 2055, 4702, 3966, 8294, 9121,
				3510, 7637, 7325, 6311, 5052, 3480, 2248, 4240, 5950, 9327, 831, 103, 7889, 5125, 2386, 7395, 4148, 5941, 3331, 8726, 9658, 8112, 9937,
				8443, 5760, 4954, 7615, 4530, 977, 3613, 3449, 8580, 4721, 7620, 3715, 8590, 3162, 1053, 301, 2897, 8068, 567, 4841, 5562, 1812, 2787,
				6199, 1828, 9552, 7918, 8712, 8891, 6277, 4258, 8803, 1395, 3699, 735, 8767, 8036, 7030, 9164, 9573, 1342, 7302, 6085, 4732, 6748, 9567,
				9498, 4864, 5553, 5631, 1749, 4852, 9706, 194, 6708, 6721, 9028, 3614, 4339, 6554, 8478, 3646, 283, 757, 1062, 3426, 2565, 6766, 4269,
				1392, 7727, 7564, 8808, 6642, 1380, 1150, 4895, 8535, 255, 6492, 3615, 1601, 3638, 4559, 932, 1837, 6380, 1090, 2404, 6215, 4198, 7706,
				5542, 2172, 2594, 9642, 7659, 5576, 7972, 4221, 50, 4149, 6361, 1577, 2032, 3788, 3379, 7070, 467, 5536, 9570, 997, 2079, 248, 9170,
				2154, 3431, 8860, 8243, 6964, 44, 53, 4785, 885, 8957, 1720, 9999, 6253, 2300, 6251, 935, 2488, 4773, 9669, 3593, 6312, 2132, 9346,
				5981, 6143, 8376, 9047, 9169, 1423, 4749, 8812, 9160, 3093, 6413, 5145, 2493, 4597, 6719, 1488, 3411, 2974, 8388, 4035, 9772, 4504, 
				9261, 7151, 8539, 8421, 231, 5949, 7261, 9400, 9069, 2194, 3585, 2019, 5270, 9914, 4106, 8350, 9240, 5595, 3246, 5678, 5681, 5938, 7824,
				8702, 2569, 321, 2437, 7850, 5717, 338, 5620, 8229, 5581, 7352, 3847, 4248, 3482, 1746, 5098, 6862, 7956, 9298, 3211, 6963, 5872, 8706,
				3747, 5628, 96, 6846, 8100, 893, 690, 4173, 3567, 7678, 2089, 2984, 4903, 4222, 872, 2449, 4169, 4477, 4528, 9300, 4183, 7322, 5291, 
				2797, 3420, 6805, 8725, 4038, 6399, 4545, 1241, 6831, 8186, 662, 7932, 8656, 7476, 6157, 7539, 9961, 487, 3794, 9824, 3139, 4619,
				7548, 8646, 3879, 8315, 9532, 8395, 4315, 5709, 7980, 1370, 8559, 3303, 184, 5535, 5782, 2552, 4759, 3186, 2874, 8141, 7360, 8208,
				3978, 6734, 1893, 5929, 6796, 6373, 9061, 402, 7908, 3273, 9010, 6234, 8512, 4896, 5953, 6993, 7540, 3647, 5979, 9473, 8090, 7424, 
				8367, 9202, 6037, 2879, 3370, 2168, 5616, 1168, 773, 4692, 3385, 4279, 3925, 5730, 125, 5371, 2878, 4496, 9515, 3442, 9166, 4572,
				9635, 3286, 9107, 9550, 6511, 2815, 6864, 2074, 8723, 683, 4611, 4678, 8151, 7861, 9377, 9387, 4571, 3758, 12, 2106, 3247, 8167,
				9383, 2221, 6579, 7064, 4134, 2906, 7864, 3251, 5519, 6504, 4369, 8602, 4792, 2736, 5327, 2786, 2720, 3685, 4130, 1514, 1534, 2581, 
				4913, 7947, 653, 8019, 4703, 7981, 6503, 8306, 1831, 9979, 1454, 3084, 3112, 7498, 3518, 3720, 3505, 8283, 3083, 1096, 9559, 1842,
				8488, 1727, 8743, 9838, 9015, 2098, 6425, 1657, 5972, 7303, 7745, 8438, 8099, 2597, 3578, 3393, 3208, 3687, 6909, 5946, 6420, 8091,
				6568, 9481, 3886, 539, 483, 1477, 6756, 9286, 8375, 4401, 3359, 112, 2845, 3138, 7953, 3645, 8498, 770, 809, 409, 7729, 3863, 786,
				2800, 7779, 3378, 3061, 9361, 2666, 6115, 7287, 1145, 912, 6450, 6474, 9089, 2615, 6328, 4349, 9954, 9614, 8160, 9602, 5863, 6992,
				6100, 5957, 1184, 4155, 913, 1034, 7074, 5447, 6521, 4077, 6494, 7215, 6982, 2167, 9155, 5566, 3833, 45, 7111, 8231, 9862, 2249,
				7913, 733, 7058, 3260, 1863, 6569, 4870, 878, 9444, 1520, 3407, 2960, 513, 143, 9019, 5527, 6765, 8392, 5916, 2054, 1532, 3415,
				9374, 5908, 4961, 5162, 181, 7723, 4027, 9263, 7006, 6385, 9782, 1819, 5340, 1232, 7868, 5280, 9987, 521, 7170, 8053, 5156, 7888, 
				394, 8419, 8794, 6985, 1649, 401, 7502, 1492, 23, 5658, 2245, 9350, 812, 3216, 8474, 7189, 3335, 2023, 3941, 4788, 5803, 6386,
				1993, 8324, 8212, 6091, 2702, 1853, 2001, 1396, 2024, 9278, 9133, 7515, 6784, 5506, 482, 5178, 4845, 9282, 760, 5385, 6286, 3281,
				5096, 7798, 8968, 9578, 1640, 5777, 6950, 9726, 2514, 9020, 4075, 5163, 5185, 7289, 3554, 7354, 3844, 1950, 3577, 8994, 8649,
				7200, 8424, 8379, 4163, 697, 5362, 3673, 7806, 708, 8607, 674, 2409, 5980, 6378, 9790, 5744, 436, 4226, 7944, 2810, 7417, 5078,
				2924, 9122, 6269, 5382, 6626, 6016, 8846, 9720, 7032, 3962, 7705, 9341, 1615, 2502, 2191, 7828, 4878, 9060, 3522, 8577, 8681,
				4584, 7024, 8359, 7790, 480, 4390, 2339, 4551, 4720, 838, 8362, 4807, 6712, 9307, 1064, 1567, 2555, 7445, 3241, 9798, 2549, 
				6045, 186, 9733, 2571, 3885, 6153, 7383, 9948, 2737, 9098, 1433, 5995, 2128, 7641, 3466, 4228, 4186, 7478, 82, 8289, 620,
				2348, 9640, 545, 434, 4846, 5913, 1132, 4107, 7721, 3490, 7751, 5832, 8909, 8550, 11, 4924, 7164, 7341, 4139, 8497} ;
	
		 for(int i = 0; i < dizi.length; i++)
	        {
	            for(int j = i+1; j < dizi.length; j++)
	            {
	                if(dizi[j] < dizi[i]) {
	                    temp = dizi[i];
	                    dizi[i] = dizi[j];
	                    dizi[j] = temp;
	                }
	            }
	        }
		 for(int k=0 ;k<dizi.length;k++) {
			 System.out.print(dizi[k]+",");

		 }
		 System.out.println();
	      
	      
	     long endTime = System.nanoTime(); 
	      // biti� zaman�

	     long estimatedTime = endTime - startTime; 
	     double seconds = (double)estimatedTime/1000000000; 
	     System.out.println(seconds);
	}

}
