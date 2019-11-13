DESCRIPTION = "URDF and meshes describing the Chrysler Pacifica."
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "roslaunch urdf xacro robot-state-publisher"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_description/1.0.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f75bc0172bfa09d63bbf823048aefc59"
SRC_URI[sha256sum] = "9ceafbf5bdce281b0423fdb9a4c50810fd443490315897c8f789cc0be28c86ee"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_description-1.0.6-1"

inherit catkin
