DESCRIPTION = "The tuw_vehicle_msgs package"
AUTHOR = "Marcel Zeilinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roscpp rospy std-msgs geometry-msgs"

RDEPENDS_${PN} = "roscpp rospy std-msgs message-runtime geometry-msgs"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_vehicle_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3d20a3d42e5f4b0d7c6d23f0025b7f19"
SRC_URI[sha256sum] = "47c7c12836c59f936116f877d105cdf3399455996e434fdb75c72fe958b94c4a"

ROS_SPN = "tuw_msgs"
S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_vehicle_msgs-0.0.13-0"

inherit catkin
