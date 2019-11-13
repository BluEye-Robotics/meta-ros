DESCRIPTION = "Controllers for Ridgeback"
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface controller-manager realtime-tools nav-msgs tf urdf"

RDEPENDS_${PN} = "interactive-marker-twist-server joint-state-controller joy robot-localization teleop-twist-joy topic-tools"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback-release/archive/release/melodic/ridgeback_control/0.2.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e42087962ae9b1e2315fb7368db396a0"
SRC_URI[sha256sum] = "01f82dc54d0014b72a8937d8a1e422319a8d28cdde23ef9ec14de797ce1311cd"

ROS_SPN = "ridgeback"
S = "${WORKDIR}/ridgeback-release-release-melodic-ridgeback_control-0.2.2-2"

inherit catkin
