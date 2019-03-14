DESCRIPTION = "Converts between Python dictionaries and JSON to rospy messages."
AUTHOR = "Brandon Alexander"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs roslib rospy message-runtime std-msgs"

RDEPENDS_${PN} = "roslib rospy message-runtime std-msgs"

SRC_URI = "https://github.com/uos-gbp/rospy_message_converter-release/archive/release/melodic/rospy_message_converter/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2c1d3b93889d33e204465e73185a9e71"
SRC_URI[sha256sum] = "c35584b4ef0c7fed1e90a35bfeb17ad63ec36a9a86ba1aaf74547cdcbd1cea37"

S = "${WORKDIR}/rospy_message_converter-release-release-melodic-rospy_message_converter-0.5.0-0"

inherit catkin
