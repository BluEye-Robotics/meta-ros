DESCRIPTION = "rosconsole_bridge is a package used in conjunction with console_bridge and rosconsole for connecting console_bridge-based logging to rosconsole-based logging."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common console-bridge rosconsole cpp-common console-bridge rosconsole"

RDEPENDS_${PN} = "cpp-common console-bridge rosconsole"

SRC_URI = "https://github.com/ros-gbp/rosconsole_bridge-release/archive/release/melodic/rosconsole_bridge/0.5.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "02d835316fbda82f37e0a6db9df0a09d"
SRC_URI[sha256sum] = "d47fadd37a04d4f165bef5173d536190baa3006dac2fa0235a14527d32169afc"

S = "${WORKDIR}/rosconsole_bridge-release-release-melodic-rosconsole_bridge-0.5.3-0"

inherit catkin
