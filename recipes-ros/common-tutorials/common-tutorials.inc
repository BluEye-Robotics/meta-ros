SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/${ROS_BPN}/${PV}.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"

inherit catkin

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_BPN}-${PV}"

ROS_SPN = "common_tutorials"
