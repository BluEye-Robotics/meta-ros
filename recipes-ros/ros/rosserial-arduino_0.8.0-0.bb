DESCRIPTION = "rosserial for Arduino/AVR platforms."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation  rospy rosserial-msgs rosserial-client message-runtime rosserial-python"

RDEPENDS_${PN} = " rospy rosserial-msgs rosserial-client message-runtime rosserial-python"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_arduino/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "82feab2b0426ce141ce3aa4ba28c62a7"
SRC_URI[sha256sum] = "dd4574a7017d7e81ffdf3d68f443017a16946a2788c02daa2ba21cf9ca351da6"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_arduino-0.8.0-0"

inherit catkin
