DESCRIPTION = "The people stack holds algorithms for perceiving people from a number of sensors."
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "face-detector leg-detector people-msgs people-tracking-filter people-velocity-tracker"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4603b4ea86ae2869aab3517bdbcfa59d"
SRC_URI[sha256sum] = "6261e11750ff43c0eecd09034928197e6266c0410bc1d8310dfa0dc899798a00"

S = "${WORKDIR}/people-release-release-melodic-people-1.2.0-1"

inherit catkin
