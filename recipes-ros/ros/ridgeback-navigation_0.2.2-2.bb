DESCRIPTION = "Launch files and code for autonomous navigation of the Ridgeback"
AUTHOR = "Shokoofeh Pourmehr"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "amcl gmapping map-server move-base urdf xacro"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback-release/archive/release/melodic/ridgeback_navigation/0.2.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2ee4c4401994bdfd58693cd2bb48c3eb"
SRC_URI[sha256sum] = "22188bcee3b4be8a9d89395483016cc92e58e429d1698a8628de0b5fb2fc18b9"

ROS_SPN = "ridgeback"
S = "${WORKDIR}/ridgeback-release-release-melodic-ridgeback_navigation-0.2.2-2"

inherit catkin
