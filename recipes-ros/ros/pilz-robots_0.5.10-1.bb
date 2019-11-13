DESCRIPTION = "The metapackage"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "prbt-support prbt-ikfast-manipulator-plugin prbt-moveit-config"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_robots/0.5.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a96801285d598afa3a4791a85555cabb"
SRC_URI[sha256sum] = "0cdb62eeb6f773114f8d454c548051821308c0bd32bbfe0054fa25d5df1615f4"

S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_robots-0.5.10-1"

inherit catkin
