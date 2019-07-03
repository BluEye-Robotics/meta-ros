DESCRIPTION = "The md49_serialport package"
AUTHOR = "Fabian Prinzing"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roscpp"

RDEPENDS_${PN} = "roscpp"

SRC_URI = "https://github.com/Scheik/md49_base_controller-release/archive/release/melodic/md49_serialport/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aa7f1d69f34f4fa04b724d5eb55d8253"
SRC_URI[sha256sum] = "fa9045a3f94fdde980a537997f23ae3d74accc8f0019fa18172c007862865408"

ROS_SPN = "md49_base_controller"
S = "${WORKDIR}/md49_base_controller-release-release-melodic-md49_serialport-0.1.4-1"

inherit catkin
