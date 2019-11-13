DESCRIPTION = "Launch files and code for autonomous navigation of the Jackal"
AUTHOR = "Shokoofeh Pourmehr"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch amcl gmapping map-server move-base urdf xacro"

RDEPENDS_${PN} = "amcl gmapping map-server move-base urdf xacro"

SRC_URI = "https://github.com/clearpath-gbp/jackal-release/archive/release/melodic/jackal_navigation/0.6.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "180c4dcd15919112080111395e4839c2"
SRC_URI[sha256sum] = "33cc60147c63d825cf40d667306fec68ada7ddf6773903ccb47b7234ea358140"

ROS_SPN = "jackal"
S = "${WORKDIR}/jackal-release-release-melodic-jackal_navigation-0.6.3-1"

inherit catkin
