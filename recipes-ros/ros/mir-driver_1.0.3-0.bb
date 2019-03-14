DESCRIPTION = "A reverse ROS bridge for the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch actionlib-msgs diagnostic-msgs dynamic-reconfigure geometry-msgs mir-actions mir-msgs move-base-msgs nav-msgs python-websocket rosgraph-msgs rospy rospy-message-converter sensor-msgs std-msgs tf visualization-msgs"

RDEPENDS_${PN} = "mir-description robot-state-publisher"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_driver/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b783ec24386bd825d30ae591d5e396fa"
SRC_URI[sha256sum] = "7d4cc4bb4f9ec504921acb945e036711c21a75de8dadafc38260dea35ef0b202"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_driver-1.0.3-0"

inherit catkin
