DESCRIPTION = "ROS-Industrial support for ABB manipulators (metapackage)."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "abb-driver abb-irb2400-moveit-config abb-irb2400-moveit-plugins abb-irb2400-support abb-irb4400-support abb-irb5400-support abb-irb6600-support abb-irb6640-support abb-irb6640-moveit-config abb-resources"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "71c42368c8196f949dcdd15b63bc0f5a"
SRC_URI[sha256sum] = "f49d38c78c44f523f9a2067ffb2bbd1c25663a7d16ec57b529f4167c45429fb0"

S = "${WORKDIR}/abb-release-release-melodic-abb-1.3.1-1"

inherit catkin
