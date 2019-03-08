DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing data structures and mapping algorithms in C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9b0e1f01a68f441eeaf7b5e18812d3c8"

SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${BP}.tar.gz \
           file://0001-Improve-the-generation-of-config.cmake-and-version.c.patch \
           "
SRC_URI[md5sum] = "794c51757cff8dd207f1eb246923e0f9"
SRC_URI[sha256sum] = "9dddd2f138d26e715b89806f180eae9017386d6ea7b621deab6354f91b9bea5d"

S = "${WORKDIR}/${BP}/${BPN}"

EXTRA_OECMAKE += "-DCMAKE_SKIP_RPATH=ON"

inherit cmake
