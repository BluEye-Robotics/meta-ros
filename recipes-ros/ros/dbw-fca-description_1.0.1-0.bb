DESCRIPTION = "URDF and meshes describing the Chrysler Pacifica."
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "roslaunch urdf xacro robot-state-publisher"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_description/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ff2db42bb5a9f176d88b87443cf0059f"
SRC_URI[sha256sum] = "f24157631c15dfc69107cb94f7a962924cd13b68739d2cdb80dc5e4041f548af"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_description-1.0.1-0"

inherit catkin
