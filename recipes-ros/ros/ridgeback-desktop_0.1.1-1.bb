DESCRIPTION = "Packages for working with Ridgeback from a ROS desktop."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ridgeback-msgs ridgeback-viz"

RDEPENDS_${PN} = "ridgeback-msgs ridgeback-viz"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback_desktop-release/archive/release/melodic/ridgeback_desktop/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f1b1d0555e7cd63f1d4863052acfab12"
SRC_URI[sha256sum] = "fa60a97d87f148815a154f6790fbf49f532669678b7ff381326cbf2797ee00f1"

S = "${WORKDIR}/ridgeback_desktop-release-release-melodic-ridgeback_desktop-0.1.1-1"

inherit catkin
