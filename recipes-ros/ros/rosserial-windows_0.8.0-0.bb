DESCRIPTION = "rosserial for Windows platforms."
AUTHOR = "Kareem Shehata"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs sensor-msgs geometry-msgs nav-msgs rosserial-client rospy rosserial-msgs rosserial-client message-runtime"

RDEPENDS_${PN} = "rospy rosserial-msgs rosserial-client message-runtime"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_windows/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a6310d52aedc9bf39be3e7e4edd24027"
SRC_URI[sha256sum] = "620b3a46eb5abe13e626c55510ee6175e35b0548be995208f0b062cbb02c7089"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_windows-0.8.0-0"

inherit catkin
