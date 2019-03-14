DESCRIPTION = "Meta-package of libraries for processing laser data, including converting laser data into 3D representations."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "laser-assembler laser-filters laser-geometry"

RDEPENDS_${PN} = "laser-assembler laser-filters laser-geometry"

SRC_URI = "https://github.com/ros-gbp/laser_pipeline-release/archive/release/melodic/laser_pipeline/1.6.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bdbb08592bfc2e7292221baae774f7dc"
SRC_URI[sha256sum] = "5d831b4e5ff12088b034f71202b7202c5d4fff9717d4a58acd5843e279f242d7"

S = "${WORKDIR}/laser_pipeline-release-release-melodic-laser_pipeline-1.6.3-0"

inherit catkin
