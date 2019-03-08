SRC_URI = "https://github.com/mavlink/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "69278a6bef8c22b214a8d2987bd9391c"
SRC_URI[sha256sum] = "f5ecbfec20f0512dd04db9e54006fcdbda44700f9e2480ce7bc065bf9e319a5c"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "mavros"
