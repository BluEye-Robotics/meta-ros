DESCRIPTION = "The ddynamic_reconfigure package"
AUTHOR = "Hilario Tome"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pal-gbp/ddynamic_reconfigure/archive/release/melodic/ddynamic_reconfigure/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c031dbad9abdb98e1501aff8a81b1770"
SRC_URI[sha256sum] = "194f34df00a51dd68668b927cac684ff36f863e931a2559c76f1e0ed92c6a957"

S = "${WORKDIR}/ddynamic_reconfigure-release-melodic-ddynamic_reconfigure-0.2.0-0"

inherit catkin
