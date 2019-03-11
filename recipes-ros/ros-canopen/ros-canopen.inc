SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/${ROS_BPN}/${PV}.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_BPN}-${PV}"

inherit catkin

ROS_SPN = "ros_canopen"
