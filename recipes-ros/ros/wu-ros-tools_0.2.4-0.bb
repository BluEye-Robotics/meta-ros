DESCRIPTION = "A collection of tools for making a variety of generic ROS-related tasks easier."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosbaglive easy-markers joy-listener kalman-filter"

RDEPENDS_${PN} = "rosbaglive easy-markers joy-listener kalman-filter"

SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/melodic/wu_ros_tools/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "14a1702ba12ea6f323e6b73585b8cdd3"
SRC_URI[sha256sum] = "c27fe7753efad044328dfe5dc67e04deb7ea2a9d69b54b1fe34bdcbdc82d7335"

S = "${WORKDIR}/wu_ros_tools-release-melodic-wu_ros_tools-0.2.4-0"

inherit catkin
