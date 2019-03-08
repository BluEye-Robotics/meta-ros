SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "172d295c71822907014167caab95c28a"
SRC_URI[sha256sum] = "b72c9495750360f532608db44ff6afe837773e95a2ca7f4d37be336fcaa6e4e9"

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_SPN}"

inherit catkin

ROS_SPN = "ecl_tools"
