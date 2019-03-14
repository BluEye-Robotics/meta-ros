DESCRIPTION = "This package defines messages for defining robot trajectories. These messages are also the building blocks of most of the"
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs message-runtime geometry-msgs std-msgs rosbag-migration-rule"

RDEPENDS_${PN} = "message-runtime geometry-msgs std-msgs rosbag-migration-rule"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/trajectory_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d0b79150f18e929050445f6eec7050d6"
SRC_URI[sha256sum] = "59b45292ef09a1fb7cd1bedcd96e390c6b17067af07bfa1035ca4d3acf631875"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-trajectory_msgs-1.12.7-0"

inherit catkin
