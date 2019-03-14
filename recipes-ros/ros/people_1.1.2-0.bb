DESCRIPTION = "The people stack holds algorithms for perceiving people from a number of sensors."
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "face-detector leg-detector people-msgs people-tracking-filter people-velocity-tracker"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people/1.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ddbbfaf947d9f1629c2e7ea6e6b23cc1"
SRC_URI[sha256sum] = "c9e1e3a253e0a4674504cf974f66e24d91ae6552eca545cd8fde925c94dd7bdc"

S = "${WORKDIR}/people-release-release-melodic-people-1.1.2-0"

inherit catkin
