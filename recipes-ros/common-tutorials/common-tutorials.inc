SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b5c72064465ee72a222519afc0961396"
SRC_URI[sha256sum] = "a2aea503b92fd5c26e895ea0471761717dd5f39f2976f98f5900836a55c07e1a"

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_SPN}"

inherit catkin

ROS_SPN = "common_tutorials"
