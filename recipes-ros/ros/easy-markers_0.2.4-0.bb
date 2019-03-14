DESCRIPTION = "Python library to assist in publishing markers easily"
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs interactive-markers roslib rospy tf visualization-msgs rospy visualization-msgs geometry-msgs tf interactive-markers roslib"

RDEPENDS_${PN} = "rospy visualization-msgs geometry-msgs tf interactive-markers roslib"

SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/melodic/easy_markers/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "033a236d037d0a5a29802f0dceee239e"
SRC_URI[sha256sum] = "64fea822e5e6ee2d58d4bfbd23519485c3197e5a8a8d74ef97ec91abc5e35088"

ROS_SPN = "wu_ros_tools"
S = "${WORKDIR}/wu_ros_tools-release-melodic-easy_markers-0.2.4-0"

inherit catkin
