DESCRIPTION = "ImageZero is a fast lossless image compression algorithm for RGB color photos."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/melodic/imagezero/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6dcd6ded834a19cd57f0a9a0fc3f4a6f"
SRC_URI[sha256sum] = "9cd7f77aca000dcb09f08f4f618755e8ee7f6099563aee77102f336e7622ec80"

ROS_SPN = "imagezero_transport"
S = "${WORKDIR}/imagezero_transport-release-release-melodic-imagezero-0.2.4-0"

inherit catkin
